package org.example.clubProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClubRegistrationProgram {
    private List<Member> members;

    public ClubRegistrationProgram(){
        new ArrayList<>();
    }

    public void addMembers(Member member){
        members.add(member);
    }

    public void deleteMemberById(Long id){
        for(Member member: members){
            if(Objects.equals(member.getId(), id)) members.remove(member);
        }

    }

    public void listAllMembers(){
        System.out.println("List of all members: ");
        for(Member members1: members){
            System.out.println(members1);
        }
    }

    public Member searchById(List<Member> members,Long id){
        for(Member member: members){
            if(Objects.equals(member.getId(), id)) return member;
        }
        throw new IllegalArgumentException("No member with the provided id.");
    }

    public String updateMember(Member member,Long id){
        for(Member listMember: members){
            if(Objects.equals(listMember.getId(), id)) {
                listMember.setName(member.getName());
                listMember.setEmail(member.getEmail());
                System.out.println("Member values updated with id: "+id);
            }
        }
        throw new IllegalArgumentException("No member with the provided id.");
    }

    public void sortMembers(List<Member> memberList){
        Collections.sort(memberList,(member1,member2)->member1.getName().compareTo(member2.getName()));
        for(Member member: memberList){
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        ClubRegistrationProgram clubRegistrationProgram=new ClubRegistrationProgram();

        //Adding of members
        clubRegistrationProgram.addMembers(new Member("Ashish",4329847L,"iofaifn@gmail.com"));
        clubRegistrationProgram.addMembers(new Member("Rahul",3429847L,"vaddsf@gmail.com"));
        clubRegistrationProgram.addMembers(new Member("Shyam",543847L,"baojfk@gmail.com"));
        clubRegistrationProgram.addMembers(new Member("Rishi",7872847L,"liuernfi@gmail.com"));

        //Deletion of Members
        clubRegistrationProgram.deleteMemberById(543847L);

        //Listing of all members
        clubRegistrationProgram.listAllMembers();

    }
}
