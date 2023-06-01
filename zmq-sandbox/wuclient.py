import zmq

context = zmq.Context()
socket = context.socket(zmq.SUB)

print("collecting updates from weather server... ")
socket.connect('tcp://localhost:5556')

zip_filter = '94108'


socket.setsockopt_string(zmq.SUBSCRIBE, zip_filter)

total_temp = 0
for update_num in range(5):
    update = socket.recv_string()
    zipcode, temperature, relhumidity = update.split()
    total_temp += int(temperature)

print(f'Five day average in zipcode {zip_filter}: {total_temp / (update_num + 1)}')
