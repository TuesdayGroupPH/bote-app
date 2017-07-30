package com.bote.delibeery.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-30T16:56:40.406+0800")
@StaticMetamodel(AddressEntity.class)
public class AddressEntity_ {
	public static volatile SingularAttribute<AddressEntity, Long> id;
	public static volatile SingularAttribute<AddressEntity, String> unitFloorHouseNum;
	public static volatile SingularAttribute<AddressEntity, String> building;
	public static volatile SingularAttribute<AddressEntity, String> street;
	public static volatile SingularAttribute<AddressEntity, String> barangaySubdivision;
	public static volatile SingularAttribute<AddressEntity, String> city;
	public static volatile SingularAttribute<AddressEntity, CustomerEntity> customer;
}
