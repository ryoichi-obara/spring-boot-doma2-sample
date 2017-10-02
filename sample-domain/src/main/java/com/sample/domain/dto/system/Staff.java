package com.sample.domain.dto.system;

import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.Email;
import org.seasar.doma.*;

import com.sample.domain.dto.common.DomaDtoImpl;
import com.sample.domain.dto.common.ID;

import lombok.Getter;
import lombok.Setter;

@Table(name = "staffs")
@Entity
@Getter
@Setter
public class Staff extends DomaDtoImpl {

    private static final long serialVersionUID = -3762941082070995608L;

    @OriginalStates // 差分UPDATEのために定義する
    Staff originalStates;

    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    ID<Staff> id;

    String password;

    // 名前
    String firstName;

    // 苗字
    String lastName;

    // メールアドレス
    @Email
    String email;

    // 電話番号
    @Digits(fraction = 0, integer = 10)
    String tel;
}