package com.ocp.pgdemo.repository;
import java.util.List;
import com.ocp.pgdemo.model.Member;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long>{
	List<Member> findByOcpgroup(String group);

}
