package org.idnode.provider.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by bhadoria on 2/28/19.
 */

@Entity
@Table(name = "ecdsakeys")
public class EcdsaKey {
    @Id
    @Column(name="user")
    public String user;

    @Column(name="key")
    public String key;

    public EcdsaKey(String user, String key) {
        this.user = user;
        this.key = key;
    }
}
