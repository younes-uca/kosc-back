package ma.maneo.kosc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.*;
import java.util.stream.Stream;

import ma.maneo.kosc.security.common.AuthoritiesConstants;
import ma.maneo.kosc.security.bean.User;
import ma.maneo.kosc.security.bean.Permission;
import ma.maneo.kosc.security.bean.Role;
import ma.maneo.kosc.security.service.facade.UserService;
import ma.maneo.kosc.security.service.facade.RoleService;
import ma.maneo.kosc.bean.Chercheur;


@SpringBootApplication
public class KoscApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(KoscApplication.class, args);
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService
    ) {
        return (args) -> {
            if (false) {
                Map<String, String> etats = new HashMap<>();
                etats.put("Initialisé", "initialise");
                etats.put("En cours", "encours");
                etats.put("Terminé", "termine");


                // Role chercheur
                Chercheur userForChercheur = new Chercheur("chercheur");

                Role roleForChercheur = new Role();
                roleForChercheur.setAuthority(AuthoritiesConstants.CHERCHEUR);
                List<Permission> permissionsForChercheur = new ArrayList<>();
                addPermissionForChercheur(permissionsForChercheur);
                roleForChercheur.setPermissions(permissionsForChercheur);
                if (userForChercheur.getRoles() == null)
                    userForChercheur.setRoles(new ArrayList<>());

                userForChercheur.getRoles().add(roleForChercheur);
                userService.save(userForChercheur);


                // Role admin
                User userForAdmin = new User("admin");

                Role roleForAdmin = new Role();
                roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
                List<Permission> permissionsForAdmin = new ArrayList<>();
                addPermissionForAdmin(permissionsForAdmin);
                roleForAdmin.setPermissions(permissionsForAdmin);
                if (userForAdmin.getRoles() == null)
                    userForAdmin.setRoles(new ArrayList<>());

                userForAdmin.getRoles().add(roleForAdmin);
                userService.save(userForAdmin);
            }
        };
    }

    private static void addPermissionForChercheur(List
                                                          <Permission> permissions) {
        permissions.add(new Permission("Region.edit"));
        permissions.add(new Permission("Region.list"));
        permissions.add(new Permission("Region.view"));
        permissions.add(new Permission("Region.add"));
        permissions.add(new Permission("Region.delete"));
        permissions.add(new Permission("TemplateEmailReport.edit"));
        permissions.add(new Permission("TemplateEmailReport.list"));
        permissions.add(new Permission("TemplateEmailReport.view"));
        permissions.add(new Permission("TemplateEmailReport.add"));
        permissions.add(new Permission("TemplateEmailReport.delete"));
        permissions.add(new Permission("RaisonArretTravail.edit"));
        permissions.add(new Permission("RaisonArretTravail.list"));
        permissions.add(new Permission("RaisonArretTravail.view"));
        permissions.add(new Permission("RaisonArretTravail.add"));
        permissions.add(new Permission("RaisonArretTravail.delete"));
        permissions.add(new Permission("Departement.edit"));
        permissions.add(new Permission("Departement.list"));
        permissions.add(new Permission("Departement.view"));
        permissions.add(new Permission("Departement.add"));
        permissions.add(new Permission("Departement.delete"));
        permissions.add(new Permission("TemplateEmailCloture.edit"));
        permissions.add(new Permission("TemplateEmailCloture.list"));
        permissions.add(new Permission("TemplateEmailCloture.view"));
        permissions.add(new Permission("TemplateEmailCloture.add"));
        permissions.add(new Permission("TemplateEmailCloture.delete"));
        permissions.add(new Permission("Operator.edit"));
        permissions.add(new Permission("Operator.list"));
        permissions.add(new Permission("Operator.view"));
        permissions.add(new Permission("Operator.add"));
        permissions.add(new Permission("Operator.delete"));
        permissions.add(new Permission("Entreprise.edit"));
        permissions.add(new Permission("Entreprise.list"));
        permissions.add(new Permission("Entreprise.view"));
        permissions.add(new Permission("Entreprise.add"));
        permissions.add(new Permission("Entreprise.delete"));
        permissions.add(new Permission("DepartementTechnicien.edit"));
        permissions.add(new Permission("DepartementTechnicien.list"));
        permissions.add(new Permission("DepartementTechnicien.view"));
        permissions.add(new Permission("DepartementTechnicien.add"));
        permissions.add(new Permission("DepartementTechnicien.delete"));
        permissions.add(new Permission("Chercheur.edit"));
        permissions.add(new Permission("Chercheur.list"));
        permissions.add(new Permission("Chercheur.view"));
        permissions.add(new Permission("Chercheur.add"));
        permissions.add(new Permission("Chercheur.delete"));
        permissions.add(new Permission("Technicien.edit"));
        permissions.add(new Permission("Technicien.list"));
        permissions.add(new Permission("Technicien.view"));
        permissions.add(new Permission("Technicien.add"));
        permissions.add(new Permission("Technicien.delete"));
        permissions.add(new Permission("EtatDemandeKosc.edit"));
        permissions.add(new Permission("EtatDemandeKosc.list"));
        permissions.add(new Permission("EtatDemandeKosc.view"));
        permissions.add(new Permission("EtatDemandeKosc.add"));
        permissions.add(new Permission("EtatDemandeKosc.delete"));
        permissions.add(new Permission("TemplateSuivi.edit"));
        permissions.add(new Permission("TemplateSuivi.list"));
        permissions.add(new Permission("TemplateSuivi.view"));
        permissions.add(new Permission("TemplateSuivi.add"));
        permissions.add(new Permission("TemplateSuivi.delete"));
        permissions.add(new Permission("TemplateEmailPlanification.edit"));
        permissions.add(new Permission("TemplateEmailPlanification.list"));
        permissions.add(new Permission("TemplateEmailPlanification.view"));
        permissions.add(new Permission("TemplateEmailPlanification.add"));
        permissions.add(new Permission("TemplateEmailPlanification.delete"));
        permissions.add(new Permission("KoscEmployee.edit"));
        permissions.add(new Permission("KoscEmployee.list"));
        permissions.add(new Permission("KoscEmployee.view"));
        permissions.add(new Permission("KoscEmployee.add"));
        permissions.add(new Permission("KoscEmployee.delete"));
        permissions.add(new Permission("ArretTravail.edit"));
        permissions.add(new Permission("ArretTravail.list"));
        permissions.add(new Permission("ArretTravail.view"));
        permissions.add(new Permission("ArretTravail.add"));
        permissions.add(new Permission("ArretTravail.delete"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.edit"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.list"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.view"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.add"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.delete"));
        permissions.add(new Permission("TemplateEmailReplanification.edit"));
        permissions.add(new Permission("TemplateEmailReplanification.list"));
        permissions.add(new Permission("TemplateEmailReplanification.view"));
        permissions.add(new Permission("TemplateEmailReplanification.add"));
        permissions.add(new Permission("TemplateEmailReplanification.delete"));
        permissions.add(new Permission("OrdreKosc.edit"));
        permissions.add(new Permission("OrdreKosc.list"));
        permissions.add(new Permission("OrdreKosc.view"));
        permissions.add(new Permission("OrdreKosc.add"));
        permissions.add(new Permission("OrdreKosc.delete"));
        permissions.add(new Permission("TemplateEmailKosc.edit"));
        permissions.add(new Permission("TemplateEmailKosc.list"));
        permissions.add(new Permission("TemplateEmailKosc.view"));
        permissions.add(new Permission("TemplateEmailKosc.add"));
        permissions.add(new Permission("TemplateEmailKosc.delete"));
        permissions.add(new Permission("Client.edit"));
        permissions.add(new Permission("Client.list"));
        permissions.add(new Permission("Client.view"));
        permissions.add(new Permission("Client.add"));
        permissions.add(new Permission("Client.delete"));
    }

    private static void addPermissionForAdmin(List
                                                      <Permission> permissions) {
        permissions.add(new Permission("Region.edit"));
        permissions.add(new Permission("Region.list"));
        permissions.add(new Permission("Region.view"));
        permissions.add(new Permission("Region.add"));
        permissions.add(new Permission("Region.delete"));
        permissions.add(new Permission("TemplateEmailReport.edit"));
        permissions.add(new Permission("TemplateEmailReport.list"));
        permissions.add(new Permission("TemplateEmailReport.view"));
        permissions.add(new Permission("TemplateEmailReport.add"));
        permissions.add(new Permission("TemplateEmailReport.delete"));
        permissions.add(new Permission("RaisonArretTravail.edit"));
        permissions.add(new Permission("RaisonArretTravail.list"));
        permissions.add(new Permission("RaisonArretTravail.view"));
        permissions.add(new Permission("RaisonArretTravail.add"));
        permissions.add(new Permission("RaisonArretTravail.delete"));
        permissions.add(new Permission("Departement.edit"));
        permissions.add(new Permission("Departement.list"));
        permissions.add(new Permission("Departement.view"));
        permissions.add(new Permission("Departement.add"));
        permissions.add(new Permission("Departement.delete"));
        permissions.add(new Permission("TemplateEmailCloture.edit"));
        permissions.add(new Permission("TemplateEmailCloture.list"));
        permissions.add(new Permission("TemplateEmailCloture.view"));
        permissions.add(new Permission("TemplateEmailCloture.add"));
        permissions.add(new Permission("TemplateEmailCloture.delete"));
        permissions.add(new Permission("Operator.edit"));
        permissions.add(new Permission("Operator.list"));
        permissions.add(new Permission("Operator.view"));
        permissions.add(new Permission("Operator.add"));
        permissions.add(new Permission("Operator.delete"));
        permissions.add(new Permission("Entreprise.edit"));
        permissions.add(new Permission("Entreprise.list"));
        permissions.add(new Permission("Entreprise.view"));
        permissions.add(new Permission("Entreprise.add"));
        permissions.add(new Permission("Entreprise.delete"));
        permissions.add(new Permission("DepartementTechnicien.edit"));
        permissions.add(new Permission("DepartementTechnicien.list"));
        permissions.add(new Permission("DepartementTechnicien.view"));
        permissions.add(new Permission("DepartementTechnicien.add"));
        permissions.add(new Permission("DepartementTechnicien.delete"));
        permissions.add(new Permission("Chercheur.edit"));
        permissions.add(new Permission("Chercheur.list"));
        permissions.add(new Permission("Chercheur.view"));
        permissions.add(new Permission("Chercheur.add"));
        permissions.add(new Permission("Chercheur.delete"));
        permissions.add(new Permission("Technicien.edit"));
        permissions.add(new Permission("Technicien.list"));
        permissions.add(new Permission("Technicien.view"));
        permissions.add(new Permission("Technicien.add"));
        permissions.add(new Permission("Technicien.delete"));
        permissions.add(new Permission("EtatDemandeKosc.edit"));
        permissions.add(new Permission("EtatDemandeKosc.list"));
        permissions.add(new Permission("EtatDemandeKosc.view"));
        permissions.add(new Permission("EtatDemandeKosc.add"));
        permissions.add(new Permission("EtatDemandeKosc.delete"));
        permissions.add(new Permission("TemplateSuivi.edit"));
        permissions.add(new Permission("TemplateSuivi.list"));
        permissions.add(new Permission("TemplateSuivi.view"));
        permissions.add(new Permission("TemplateSuivi.add"));
        permissions.add(new Permission("TemplateSuivi.delete"));
        permissions.add(new Permission("TemplateEmailPlanification.edit"));
        permissions.add(new Permission("TemplateEmailPlanification.list"));
        permissions.add(new Permission("TemplateEmailPlanification.view"));
        permissions.add(new Permission("TemplateEmailPlanification.add"));
        permissions.add(new Permission("TemplateEmailPlanification.delete"));
        permissions.add(new Permission("KoscEmployee.edit"));
        permissions.add(new Permission("KoscEmployee.list"));
        permissions.add(new Permission("KoscEmployee.view"));
        permissions.add(new Permission("KoscEmployee.add"));
        permissions.add(new Permission("KoscEmployee.delete"));
        permissions.add(new Permission("ArretTravail.edit"));
        permissions.add(new Permission("ArretTravail.list"));
        permissions.add(new Permission("ArretTravail.view"));
        permissions.add(new Permission("ArretTravail.add"));
        permissions.add(new Permission("ArretTravail.delete"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.edit"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.list"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.view"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.add"));
        permissions.add(new Permission("TemplateEmailClientInjoinable.delete"));
        permissions.add(new Permission("TemplateEmailReplanification.edit"));
        permissions.add(new Permission("TemplateEmailReplanification.list"));
        permissions.add(new Permission("TemplateEmailReplanification.view"));
        permissions.add(new Permission("TemplateEmailReplanification.add"));
        permissions.add(new Permission("TemplateEmailReplanification.delete"));
        permissions.add(new Permission("OrdreKosc.edit"));
        permissions.add(new Permission("OrdreKosc.list"));
        permissions.add(new Permission("OrdreKosc.view"));
        permissions.add(new Permission("OrdreKosc.add"));
        permissions.add(new Permission("OrdreKosc.delete"));
        permissions.add(new Permission("TemplateEmailKosc.edit"));
        permissions.add(new Permission("TemplateEmailKosc.list"));
        permissions.add(new Permission("TemplateEmailKosc.view"));
        permissions.add(new Permission("TemplateEmailKosc.add"));
        permissions.add(new Permission("TemplateEmailKosc.delete"));
        permissions.add(new Permission("Client.edit"));
        permissions.add(new Permission("Client.list"));
        permissions.add(new Permission("Client.view"));
        permissions.add(new Permission("Client.add"));
        permissions.add(new Permission("Client.delete"));
    }


}


