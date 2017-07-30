package com.bote.delibeery.entity;

import com.bote.delibeery.type.LoginType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-30T22:24:34.053+0800")
@StaticMetamodel(CustomerEntity.class)
public class CustomerEntity_ {
	public static volatile SingularAttribute<CustomerEntity, Long> id;
	public static volatile SingularAttribute<CustomerEntity, String> lastName;
	public static volatile SingularAttribute<CustomerEntity, String> contactNumber;
	public static volatile SingularAttribute<CustomerEntity, String> loginId;
	public static volatile SingularAttribute<CustomerEntity, String> name;
	public static volatile SingularAttribute<CustomerEntity, String> email;
	public static volatile SingularAttribute<CustomerEntity, LoginType> loginType;
	public static volatile SingularAttribute<CustomerEntity, String> photoUrl;
}
