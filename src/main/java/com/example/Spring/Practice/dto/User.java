package com.example.Spring.Practice.dto;

import com.example.Spring.Practice.annotation.YearMonth;
import org.hibernate.validator.internal.util.privilegedactions.LoadClass;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

    @NotBlank private String name;
    @Max(value = 90)
    private int age;
    @Email private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "휴대폰 번호 양식이 맞지 않습니다. 01x-xxx(x)-xxxx")
    private String phoneNumber;

//    @Size(min = 6, max = 6)
    @YearMonth(pattern = "yyyyMMdd")
    private String reqYearMonth;        // yyyyMM



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReqYearMonth() {
        return reqYearMonth;
    }

    public void setReqYearMonth(String reqYearMonth) {
        this.reqYearMonth = reqYearMonth;
    }

//    @AssertTrue(message = "yyyyMM 의 형식이여야 합니다.")
//    public boolean isReqYearMonthValidation(){
//        System.out.println("Call reqYearMonth");
//        //this.reqYearMonth = getReqYearMonth() + "01";
//        try {
//            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//            //LocalDate localDate = LocalDate.parse(this.reqYearMonth, DateTimeFormatter.ofPattern("yyyyMMdd"));
//        }catch (Exception e){
//            return false;
//        }
//
//        return true;
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", reqYearMonth='" + reqYearMonth + '\'' +
                '}';
    }
}
