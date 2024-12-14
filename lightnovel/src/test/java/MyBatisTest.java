import mapper.UserMapper;
import model.User;
import org.apache.ibatis.session.SqlSession;

public class MyBatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserByUid(2);
        System.out.println(user);

        sqlSession.close();
    }
}
