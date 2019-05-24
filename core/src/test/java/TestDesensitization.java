import com.paprika.spring.boot.mvc.service.impl.DesensitizationImpl;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @author adam
 * @date 2019/5/24
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class TestDesensitization {

    private DesensitizationImpl desensitizationService = new DesensitizationImpl();

    @Test
    public void TestName(){
        assertEquals("周**", desensitizationService.name("周星驰"));
    }
    @Test
    public void TestIdCardNum(){
        assertEquals("110***********023X", desensitizationService.idCardNum("11010119960101023X"));
    }
    @Test
    public void TestAddress(){
        assertEquals("深圳市南山区粤海街道*****", desensitizationService.address("深圳市南山区粤海街道高新南七道",5));
    }
    @Test
    public void TestMobilePhone(){
        assertEquals("138****2254", desensitizationService.mobilePhone("13879632254"));
    }
    @Test
    public void TestFixedPhone(){
        assertEquals("****891", desensitizationService.fixedPhone("4756891"));
    }
    @Test
    public void TestEmail(){
        assertEquals("a***@noreply.gmail.com", desensitizationService.email("adam@noreply.gmail.com"));
    }
    @Test
    public void TestBankCard(){
        assertEquals("************3241", desensitizationService.bankCard("4514784166353241"));
    }
    @Test
    public void TestPassword(){
        assertEquals("******", desensitizationService.password("KiX7E8XcNhAI$HYZ"));
    }

}
