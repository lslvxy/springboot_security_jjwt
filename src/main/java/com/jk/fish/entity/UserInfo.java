package com.jk.fish.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


/**
 * com.jk.fish.entity
 *
 * @author lise
 * @comment
 * @date 2018-12-10 10:22
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UserInfo extends BaseEntity implements UserDetails {

    /**
     * 用户编号
     */
    private String userGuid;
    /**
     * 用户权限
     */
    private String groupName;
    /**
     * 用户单位
     */
    private String monitUnitName;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 用户密码
     */
    @JsonIgnore
    private String password;
    /**
     * 用户电话
     */
    private String telephone;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户描述
     */
    private String description;
    /**
     * 是否激活
     */
    private String active;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
