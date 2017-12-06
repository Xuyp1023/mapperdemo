package com.better.mapper.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import tk.mybatis.mapper.entity.IDynamicTableName;

@Access(AccessType.FIELD)
@Entity
@Table(name = "castest")
public class CasTestEntity implements Serializable, IDynamicTableName {

    /** 
     * @Fields serialVersionUID : 
     * 
     *  
     *         CREATE TABLE `castest` (
                `id` bigint(20) DEFAULT NULL,
                `version` int(11) DEFAULT NULL,
                `data` int(255) DEFAULT NULL
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
     */
    private static final long serialVersionUID = -3130114581943132304L;

    /**
     * 流水号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    private Long id;

    @Column(name = "version", columnDefinition = "INTEGER")
    private int versionVersion;

    @Column(name = "data", columnDefinition = "INTEGER")
    private int dataData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersionVersion() {
        return versionVersion;
    }

    public void setVersionVersion(int versionVersion) {
        this.versionVersion = versionVersion;
    }

    public int getDataData() {
        return dataData;
    }

    public void setDataData(int dataData) {
        this.dataData = dataData;
    }

    @Override
    public String toString() {
        return "CasTestEntity [id=" + id + ", versionVersion=" + versionVersion + ", dataData=" + dataData + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dataData;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + versionVersion;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CasTestEntity)) {
            return false;
        }
        CasTestEntity other = (CasTestEntity) obj;
        if (dataData != other.dataData) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (versionVersion != other.versionVersion) {
            return false;
        }
        return true;
    }

    @Transient // 非表字段，字段名称无所谓
    private String dynamicTableName;

    @Override
    public String getDynamicTableName() {
        //
        return dynamicTableName;
    }

    public void setDynamicTableName(String dynamicTableName) {
        //
        this.dynamicTableName = dynamicTableName;
    }

}
