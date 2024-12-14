package dao;

import mapper.UserMapper;
import model.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends SqlSessionDaoSupport {
    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public User selectUserByUid(int uid) {
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        return userMapper.selectUserByUid(uid);
    }
}
