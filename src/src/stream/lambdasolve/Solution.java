package stream.lambdasolve;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {

        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        double output = computeAverageOfMaleMember(members);
        System.out.println(output); // --> 31.0
    }
    public static double computeAverageOfMaleMember(List<Member> members) {

        Stream<Member> maleStream = members.stream().filter(member -> member.getGender().equals("Male"));

        if(members.isEmpty() || maleStream.findAny().isEmpty()) { return 0; }
        //평균 나이 구하기
        Stream<Integer> ages = members.stream().filter(member -> member.getGender().equals("Male")).map(m -> m.getAge());
        double avg = ages.mapToDouble(d -> d).average().orElse(0.0);


        return avg;
    }


    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
