package com.bote.delibeery.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-30T02:16:36.524+0800")
@StaticMetamodel(ItemEntity.class)
public class ItemEntity_ {
	public static volatile SingularAttribute<ItemEntity, Long> id;
	public static volatile SingularAttribute<ItemEntity, String> code;
	public static volatile SingularAttribute<ItemEntity, String> description;
	public static volatile SingularAttribute<ItemEntity, BigDecimal> unitPrice;
}
