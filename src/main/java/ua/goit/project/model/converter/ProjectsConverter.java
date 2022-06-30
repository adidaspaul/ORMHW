package ua.goit.project.model.converter;

import ua.goit.project.model.dao.ProjectsDao;
import ua.goit.project.model.dto.ProjectsDto;

import java.util.stream.Collectors;

public class ProjectsConverter implements Convertor<ProjectsDao, ProjectsDto> {

    private DevelopersConverter developersConverter;

    public ProjectsConverter(DevelopersConverter developersConverter) {
        this.developersConverter = developersConverter;
    }

    @Override
    public ProjectsDto toDto(ProjectsDao dao) {
        ProjectsDto dto = new ProjectsDto();
        dto.setId(dao.getId());
        dto.setName(dao.getName());
        dto.setDescription(dao.getDescription());
        dto.setCompanyId(dao.getCompanyId());
        dto.setCustomerId(dao.getCustomerId());
        dto.setDate(dao.getDate());
        dto.setDevelopers(dao.getDevelopers().stream()
                .map(developersConverter::toDto)
                .collect(Collectors.toSet()));
        return dto;
    }

    @Override
    public ProjectsDao toDao(ProjectsDto dto) {
        ProjectsDao dao = new ProjectsDao();
        dao.setId(dto.getId());
        dao.setName(dto.getName());
        dao.setDescription(dto.getDescription());
        dao.setCompanyId(dto.getCompanyId());
        dao.setCustomerId(dto.getCustomerId());
        dao.setDate(dto.getDate());
        dao.setDevelopers(dto.getDevelopers().stream()
                .map(developersConverter::toDao)
                .collect(Collectors.toSet()));
        return dao;
    }
}
