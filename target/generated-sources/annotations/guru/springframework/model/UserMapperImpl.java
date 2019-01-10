package guru.springframework.model;

import guru.springframework.domain.User;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-10T18:37:09-0400",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand convertToCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User convertToEntity(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
