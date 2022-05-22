package optional.optionalobject;

import optional.optionalobject.entity.Car;
import optional.optionalobject.entity.Insurance;
import optional.optionalobject.entity.Member;
import optional.optionalobject.service.MemberService;

public class MemberTest {

    public static void main(String[] args) {

        MemberService memberService = new MemberService();

        String insuranceName = memberService
                .getMember("kevin1234")
                .flatMap(Member::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getCompanyName)
                .orElse("Not result");

        System.out.println(insuranceName);
    }
}
