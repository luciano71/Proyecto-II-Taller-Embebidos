import asyncio
import websockets
import pandas as pd

async def response(websocket, path):
    message = await websocket.recv()
    print(f"We got the message from the client: {message}")
    await websocket.send("I can confirm I got your message")
    DF = pd.read_json(message)
    print(DF)
start_server = websockets.serve(response, '192.168.100.5', 1234)
asyncio.get_event_loop().run_until_complete(start_server)
asyncio.get_event_loop().run_forever()
