package com.project.HibernateJPABeginner;
import com.test.hib.controller.findUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	findUser_Hql u = new findUser_Hql();
    	//u.findUser();
    	//u.findUserSelect();
    	//u.getRecordbyId();
    	//u.getrecords();
    	//u.getmaxSalary();
    	u.getmaxSalaryGroupBy();

    }
}
