package history.spring.data.neo4j.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * @author junyuan
 */

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "Happen_In")
public class HappenIn {
    @GraphId
    private Long id;

    @StartNode
    public Event event;

    @EndNode
    public Date date;

    public HappenIn(Event event, Date date) {
        this.event = event;
        this.date = date;
    }

    public Event getEvent() {
        return event;
    }

    public Date getDate() {
        return date;
    }
}
