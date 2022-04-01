/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new HashSet<>();
    }

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }

    @Override
    public void service() {
        members.forEach(member -> {
            member.service();
        });
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : members) {
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
