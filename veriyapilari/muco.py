
import requests

i=1
while(i>0):
    url = 'https://profile-counter.glitch.me/%7BmucahitAgdin%7D/count.svg'
    r = requests.get(url, allow_redirects=True)

open('count.svg', 'wb').write(r.content)