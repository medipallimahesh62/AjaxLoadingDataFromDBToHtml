package com.myprofile.myprofile.repository;

import com.myprofile.myprofile.entity.MyProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MyProfileRepository")
public interface MyProfileRepository extends JpaRepository<MyProfile, Long> {

}
