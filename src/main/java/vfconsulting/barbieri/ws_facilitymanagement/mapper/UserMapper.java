package vfconsulting.barbieri.ws_facilitymanagement.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import vfconsulting.barbieri.ws_facilitymanagement.model.UserModel;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_usuario;")
    List<UserModel> obtenerUsuarios();
}
