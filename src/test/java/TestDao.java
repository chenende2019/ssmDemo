import com.alibaba.ssmDemo.dao.UserDao;
import com.alibaba.ssmDemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestDao {
    @Autowired
    private UserDao userDao;
    @Test
    public void insert(){
        User user = new User();
        user.setName("小花");
        user.setAddress("河南省新郑市");
        user.setAge(13);
        user.setSex(0);
        System.out.println(user);
        userDao.insert(user);
    }
    @Test
    public void select(){
        User userById = userDao.findUserById(2);
        System.out.println(userById);
    }
}
