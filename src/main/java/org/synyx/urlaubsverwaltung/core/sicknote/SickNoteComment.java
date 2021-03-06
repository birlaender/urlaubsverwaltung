package org.synyx.urlaubsverwaltung.core.sicknote;

import org.synyx.urlaubsverwaltung.core.comment.AbstractComment;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;


/**
 * Comment to a sick note containing detailed information like date of comment or commenting person.
 *
 * @author  Aljona Murygina - murygina@synyx.de
 */
@Entity
public class SickNoteComment extends AbstractComment {

    @ManyToOne
    private SickNote sickNote;

    @Enumerated(EnumType.STRING)
    private SickNoteAction action;

    public SickNote getSickNote() {

        return sickNote;
    }


    public void setSickNote(SickNote sickNote) {

        this.sickNote = sickNote;
    }


    public SickNoteAction getAction() {

        return action;
    }


    public void setAction(SickNoteAction action) {

        this.action = action;
    }
}
