package HibernateBSM.DaoImpl;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateBSM.config.HibernateUtil;
import HibernateBSM.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class CustomerDaoImpl {
	public void openAcc() {
		Scanner sc=new Scanner(System.in);
		String n,e;
		int d;
		long p;
		System.out.println("Enter name: ");
		n=sc.nextLine();
		System.out.println("Enter Amount Deposit: ");
		d=sc.nextInt();
		System.out.println("Enter email:");
		e=sc.next();
		System.out.println("Enter Phonenumber: ");
		p=sc.nextLong();
		Customer b=new Customer();
		b.setName(n);
		b.setDeposit(d);
		b.setEmail(e);
		b.setPhone(p);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(b);
		System.err.println("New Account Added");
		t.commit();
}
	public void updateAcc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Customer std=session.get(Customer.class, id);
		System.out.println("Enter phone number: ");
		long phone=sc.nextLong();
		std.setPhone(phone);
		session.update(std);
		System.err.println("Update Successfully...");
		t.commit();
	}
	public void deleteAcc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		Customer std1=session.get(Customer.class, id);
		session.delete(std1);
		System.err.println("Delete Successfully....");
		t.commit();
	}
	public void fetchAcc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer s1=session.get(Customer.class, id);
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDeposit()+" "+s1.getEmail()+" "+s1.getPhone());
	}
}