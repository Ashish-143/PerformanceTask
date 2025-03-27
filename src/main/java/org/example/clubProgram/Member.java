package org.example.clubProgram;

public class Member {
    private String name;
    private Long id;
    private String email;

    public Member(String name, Long id, String email){
        this.name=name;
        this.id=id;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Member name: "+name+" id: "+id+" email:"+email;
    }
}
