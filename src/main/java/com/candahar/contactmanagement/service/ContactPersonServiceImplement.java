package com.candahar.contactmanagement.service;

import com.candahar.contactmanagement.dao.BaseDao;
import com.candahar.contactmanagement.dao.ContactPersonDao;
import com.candahar.contactmanagement.domain.ContactPerson;
import com.candahar.contactmanagement.exception.ContactBlockException;
import com.candahar.contactmanagement.rm.ContactPersonRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ContactPersonServiceImplement extends BaseDao implements ContactPersonService {

    @Autowired
    private ContactPersonDao contactPersonDao;

    @Override
    public void register(ContactPerson contactPerson) {
        contactPersonDao.save(contactPerson);
    }

    @Override
    public ContactPerson login(String loginName, String password) throws ContactBlockException {
        String sql = "SELECT\n"
                + "  ContactPersonId,\n"
                + "  ContactPersonName,\n"
                + "  ContactPersonPhone,\n"
                + "  ContactPersonEmail,\n"
                + "  ContactPersonAddress,\n"
                + "  ContactPersonLoginName,\n"
                + "  ContactPersonPassword,\n"
                + "  ContactPersonRole,\n"
                + "  ContactPersonLoginStatus\n"
                + "FROM\n"
                + "  ContactManagement.contactperson\n"
                + "WHERE ContactPersonLoginName = :loginName AND ContactPersonPassword = :password";
        Map map = new HashMap();
        map.put("loginName", loginName);
        map.put("password", password);
        try {
            ContactPerson contactPerson = getNamedParameterJdbcTemplate().queryForObject(sql, map, new ContactPersonRowMapper());
            if (contactPerson.getContactPersonLoginStatus().equals(ContactPersonService.LOGIN_STATUS_BLOCKED)) {
                throw new ContactBlockException("Your account has been blocked, please contact your admin");
            } else {
                return contactPerson;
            }
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<ContactPerson> getContactPersonList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeLoginStatus(int ContactPersonId, int ContactPersonLoginStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
