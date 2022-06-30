package ua.goit.project.model.dto;

import java.sql.Date;
import java.util.Set;

public class ProjectsDto {
    private Integer id;
    private String name;
    private String description;
    private Integer companyId;
    private Integer customerId;
    private Date date;
    private Set<DevelopersDto> developers;

    public ProjectsDto(Integer id, String name, String description, Integer companyId,
                       Integer customerId, Date date, Set<DevelopersDto> developers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.companyId = companyId;
        this.customerId = customerId;
        this.date = date;
        this.developers = developers;
    }

    public ProjectsDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<DevelopersDto> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<DevelopersDto> developers) {
        this.developers = developers;
    }
}
