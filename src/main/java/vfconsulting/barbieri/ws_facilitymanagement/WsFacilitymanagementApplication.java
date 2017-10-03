package vfconsulting.barbieri.ws_facilitymanagement;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vfconsulting.barbieri.ws_facilitymanagement.model.UserModel;

@MappedTypes(UserModel.class)
@MapperScan("vfconsulting.barbieri.ws_facilitymanagement.mapper")
@SpringBootApplication
public class WsFacilitymanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsFacilitymanagementApplication.class, args);
	}

}
