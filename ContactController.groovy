//程序清单21.8 使用Groovy编写的ContactController要比java更简单

@Grab("spring-boot-starter-actuator")
@Grab("thymeleaf-spring4")//获得Thymeleaf依赖

@Controller
@RequestMapping("/")
class ContactController {

    @Autowired
    ContactRepository contactRepo

    @RequestMapping(method=RequestMethod.GET)
    String home(Map<String,Object> model) {
        List<Contact> contacts = contactRepo.findAll()
        model.putAll([contacts: contacts])
        "home"
    }

    @RequestMapping(method=RequestMethod.POST)
    String submit(Contact contact) {
        contactRepo.save(contact)
        "redirect:/"
    }
}