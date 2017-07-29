package com.bote.delibeery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-29T17:32:51.217+0800")
@StaticMetamodel(CustomerEntity.class)
public class CustomerEntity_ {
	public static volatile SingularAttribute<CustomerEntity, Long> id;
	public static volatile SingularAttribute<CustomerEntity, String> firstName;
	public static volatile SingularAttribute<CustomerEntity, String> lastName;
	public static volatile SingularAttribute<CustomerEntity, String> emailAddress;
	public static volatile SingularAttribute<CustomerEntity, String> contactNumber;
}
