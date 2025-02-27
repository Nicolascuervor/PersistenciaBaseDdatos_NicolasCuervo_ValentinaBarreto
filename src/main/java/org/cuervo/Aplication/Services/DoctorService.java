package org.cuervo.Aplication.Services;

import org.cuervo.Domain.Doctor;
import org.cuervo.Domain.Doctor;
import org.cuervo.Interfaces.DoctorRepository;

import java.util.List;

public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void crearDoctor(Doctor doctor) {
        doctorRepository.saveDoctor(doctor);
    }

    public List<Doctor> listarDoctors() {
        return doctorRepository.findAll();
    }

    public void eliminarDoctor(int id) {
        doctorRepository.deleteDoctor(id);
    }

    public Doctor buscarDoctorPorId(int id) {
        return doctorRepository.findDoctorById(id);
    }

    public void actualizarDoctor(Doctor doctor) {
        doctorRepository.updateDoctor(doctor);
    }
}
