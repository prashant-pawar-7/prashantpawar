package com.product.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
	@Id
private int cid;
private String cname;
@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Product> pList;
}
