package com.trancecoder.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trancecoder.dataobject.contactDetails;


public interface ContactRepo extends CrudRepository<contactDetails, Serializable> {

}
