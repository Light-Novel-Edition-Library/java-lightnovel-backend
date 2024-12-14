package mapper;

import model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUserByUid(@Param("uid") int uid);
}
