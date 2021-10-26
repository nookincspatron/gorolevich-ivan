package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class TaskActions {

    @Column(name = "task_create")
    private Boolean taskCreate = null;

    @Column(name = "task_edit")
    private Boolean taskEdit = null;

    @Column(name = "task_perform")
    private Boolean taskPerform = null;

    @Column(name = "task_delegate")
    private Boolean taskDelegate = null;

    @Column(name = "task_review")
    private Boolean taskReview = null;

    @Column(name = "task_report")
    private Boolean taskReport = null;

    @Override
    public boolean equals(Object object) {
        TaskActions that = (TaskActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (taskCreate != null ? !taskCreate.equals(that.taskCreate) : that.taskCreate != null)
            return false;
        if (taskEdit != null ? !taskEdit.equals(that.taskEdit) : that.taskEdit != null)
            return false;
        if (taskPerform != null ? !taskPerform.equals(that.taskPerform) : that.taskPerform != null)
            return false;
        if (taskDelegate != null ? !taskDelegate.equals(that.taskDelegate) : that.taskDelegate != null)
            return false;
        if (taskReview != null ? !taskReview.equals(that.taskReview) : that.taskPerform != null)
            return false;
        return taskReport != null ? taskReport.equals(that.taskReport) : that.taskReport == null;
    }
}