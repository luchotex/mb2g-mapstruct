package guru.springframework.model;

import guru.springframework.domain.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserCommand convertToCommand(User user);
    User convertToEntity(UserCommand userCommand);
}
