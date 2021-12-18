package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class TaskActions {

    @Column(name = "task_create")
    private Boolean taskCreate = null;

    @Column(name = "task_delegate")
    private Boolean taskDelegate = null;

    @Column(name = "task_review")
    private Boolean taskReview = null;

    @Override
    public boolean equals(Object object) {
        TaskActions that = (TaskActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (taskCreate != null ? !taskCreate.equals(that.taskCreate) : that.taskCreate != null)
            return false;
        if (taskDelegate != null ? !taskDelegate.equals(that.taskDelegate) : that.taskDelegate != null)
            return false;
        return taskReview != null ? taskReview.equals(that.taskReview) : that.taskReview == null;
    }
}