package com.example.employee.service;

import com.example.employee.model.Employee;

import java.util.List;

public interface IEmployeeService {
    // hàm thêm nhân viên
    public Employee addEmployee(Employee employee);

//    hàm chỉnh sửa thông tin nhân viên
    public Employee updateEmployee(long id, Employee employee);

//    hàm xóa nhân viên
    public boolean deteleEmployee(long id);

//    ham lay danh sach nhan vien
    public List<Employee> getAllEmployee();

//    ham lay ra 1 nhan vien
    public  Employee getOneEmployee(long id);
}
