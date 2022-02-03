package studio.purunnal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRestController {
	@RequestMapping(value = "/member/{memberName}", method = RequestMethod.GET)
	public String member(@PathVariable("memberName") String memberName) {
		
		return memberName;
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public void hello() {
		System.out.println("Hello");
		
		
	}	
	
}
