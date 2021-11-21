
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delete_QNAME = new QName("http://services/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://services/", "deleteResponse");
    private final static QName _FindAllStudent_QNAME = new QName("http://services/", "findAllStudent");
    private final static QName _FindAllStudentResponse_QNAME = new QName("http://services/", "findAllStudentResponse");
    private final static QName _FindStudentById_QNAME = new QName("http://services/", "findStudentById");
    private final static QName _FindStudentByIdResponse_QNAME = new QName("http://services/", "findStudentByIdResponse");
    private final static QName _Insert_QNAME = new QName("http://services/", "insert");
    private final static QName _Student_QNAME = new QName("http://services/", "student");
    private final static QName _Update_QNAME = new QName("http://services/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://services/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindAllStudent }
     * 
     */
    public FindAllStudent createFindAllStudent() {
        return new FindAllStudent();
    }

    /**
     * Create an instance of {@link FindAllStudentResponse }
     * 
     */
    public FindAllStudentResponse createFindAllStudentResponse() {
        return new FindAllStudentResponse();
    }

    /**
     * Create an instance of {@link FindStudentById }
     * 
     */
    public FindStudentById createFindStudentById() {
        return new FindStudentById();
    }

    /**
     * Create an instance of {@link FindStudentByIdResponse }
     * 
     */
    public FindStudentByIdResponse createFindStudentByIdResponse() {
        return new FindStudentByIdResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllStudent")
    public JAXBElement<FindAllStudent> createFindAllStudent(FindAllStudent value) {
        return new JAXBElement<FindAllStudent>(_FindAllStudent_QNAME, FindAllStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllStudentResponse")
    public JAXBElement<FindAllStudentResponse> createFindAllStudentResponse(FindAllStudentResponse value) {
        return new JAXBElement<FindAllStudentResponse>(_FindAllStudentResponse_QNAME, FindAllStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentById")
    public JAXBElement<FindStudentById> createFindStudentById(FindStudentById value) {
        return new JAXBElement<FindStudentById>(_FindStudentById_QNAME, FindStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIdResponse")
    public JAXBElement<FindStudentByIdResponse> createFindStudentByIdResponse(FindStudentByIdResponse value) {
        return new JAXBElement<FindStudentByIdResponse>(_FindStudentByIdResponse_QNAME, FindStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
