package effective.optional.optionalobject;

import effective.optional.optionalobject.entity.Car;
import effective.optional.optionalobject.entity.Insurance;
import effective.optional.optionalobject.entity.Member;
import effective.optional.optionalobject.service.MemberService;

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
