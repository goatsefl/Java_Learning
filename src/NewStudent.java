
/* Unlike Pojo, record is a new type of class implemented to make data holding classes immutable
* Used to reduce boilerplate code, which is repetitive and tools can be used to fill the code.
* Records automatically generate toString(), equals(), hashCode()
* Records are a feature of jdk16
* They need a record header and they can all the details regarding the */
public record NewStudent(String id, String name, String dateOfBirth, String classList) {
}
