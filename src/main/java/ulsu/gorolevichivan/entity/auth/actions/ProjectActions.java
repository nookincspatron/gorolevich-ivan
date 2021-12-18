package ulsu.gorolevichivan.entity.auth.actions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class ProjectActions {

    @Column(name = "project_create")
    private Boolean projectCreate = null;

    @Column(name = "project_edit")
    private Boolean projectEdit = null;

    @Override
    public boolean equals(Object object) {
        ProjectActions that = (ProjectActions) object;

        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        if (projectCreate != null ? !projectCreate.equals(that.projectCreate) : that.projectCreate != null)
            return false;
        return projectEdit != null ? !projectEdit.equals(that.projectEdit) : that.projectEdit == null;
    }
}
