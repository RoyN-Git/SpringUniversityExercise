package controllers;

    @RestController   //localhost:8080
    @RequestMapping ("school") //localhost:8080/school
//3000 -> React
//2000 -> Angular
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
    @RequiredArgsConstructor
    public class SchoolController {
        //@Autowired //IOC -> Inversion of control. (Circular dependency)
        private final School school;
        //read – get
    }
    //read - get
    @GetMapping("all") //localhost:8080/school/all
    public ResponseEntity<?> getAllLecturerrrrr(){
        return new ResponseEntity<>(school.getAllLecturer(), HttpStatus.OK);
    }
    //read -get one lecturer
    @GetMapping("lecturer/{id}")  //{id}-PathVariable
    public ResponseEntity<?> getOneLecturer(@PathVariable int id){
        return new ResponseEntity<>(school.findLecturerById(id),HttpStatus.OK);
    }

    @GetMapping("lecturerStudent/{id}/{studentID}")
    public ResponseEntity<?> getStudentByLecturer(@PathVariable int id, @PathVariable int studentID){
        return null;
    }
    //read - get
    @GetMapping("all") //localhost:8080/school/all
    public ResponseEntity<?> getAllLecturerrrrr(){
        return new ResponseEntity<>(school.getAllLecturer(), HttpStatus.OK);
    }
    //read -get one lecturer
    @GetMapping("lecturer/{id}")  //{id}-PathVariable
    public ResponseEntity<?> getOneLecturer(@PathVariable int id){
        return new ResponseEntity<>(school.findLecturerById(id),HttpStatus.OK);
    }

    @GetMapping("lecturerStudent/{id}/{studentID}")
    public ResponseEntity<?> getStudentByLecturer(@PathVariable int id, @PathVariable int studentID){
        return null;
    }
    //update
    @PutMapping("lecturer/update")
    public void updateLecturer(@RequestBody Lecturer lecturer){
        try {
            school.updateLecturer(lecturer);
        } catch (SchoolException e) {
            System.out.println(e.getMessage());
        }
    }
}
