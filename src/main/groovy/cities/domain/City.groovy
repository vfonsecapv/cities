package cities.domain

import groovy.transform.ToString
import groovy.transform.TupleConstructor

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name="city")
@ToString
@TupleConstructor
class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    long id

    @Column(nullable = false)
    String name

    @Column(nullable = false)
    String county

    @Column(nullable = false)
    String stateCode

    @Column(nullable = false)
    String postalCode

    @Column
    String latitude

    @Column
    String longitude
}