package vfconsulting.barbieri.ws_facilitymanagement.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vfconsulting.barbieri.ws_facilitymanagement.mapper.UserMapper;
import vfconsulting.barbieri.ws_facilitymanagement.model.UserModel;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResources{

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/all")
    public List<UserModel> obtenerUsuarios(){
        return userMapper.obtenerUsuarios();
    }
}
