package ma.maneo.kosc.service.core.impl;


import ma.maneo.kosc.bean.Archivable;
import ma.maneo.kosc.service.core.facade.ArchivableService;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ArchivableServiceImpl<T extends Archivable> implements ArchivableService<T> {

    @Override
    public int prepare(T object) {
        if (object == null) {
            return -1;
        }
        if (object.getArchive() == null) {
            object.setArchive(false);
        }
        if (object.getArchive() == true) {
            object.setDateArchivage(new Date());
        }
        return 1;
    }

    @Override
    public int prepareArchivage(T object) {
        if (object == null) {
            return -1;
        }
        if (object.getArchive() == null) {
            object.setArchive(false);
        }
        if (object.getArchive() == true) {
            return -2;
        } else {
            object.setArchive(true);
            object.setDateArchivage(new Date());
            return 1;
        }
    }

    @Override
    public int prepareDesarchivage(T object) {
        if (object == null) {
            return -1;
        }
        if (object.getArchive() == null) {
            object.setArchive(false);
        }
        if (object.getArchive() == false) {
            return -2;
        } else {
            object.setArchive(false);
            object.setDateArchivage(null);
            return 1;
        }
    }

}
