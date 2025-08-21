-- Runs on first boot (if table empty)
INSERT INTO complaint (description, category, priority, status, created_at)
VALUES ('Network down in floor-2', 'Network', 'HIGH', 'OPEN', NOW()),
       ('Printer not responding', 'Hardware', 'MEDIUM', 'IN_PROGRESS', NOW()),
       ('Projector lamp issue', 'Hardware', 'LOW', 'RESOLVED', NOW() - INTERVAL 10 DAY);
