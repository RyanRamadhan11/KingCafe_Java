PGDMP                      |            db_kingcafe_java     16.0 (Ubuntu 16.0-1.pgdg23.04+1)     16.0 (Ubuntu 16.0-1.pgdg23.04+1)     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    32208    db_kingcafe_java    DATABASE     |   CREATE DATABASE db_kingcafe_java WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.UTF-8';
     DROP DATABASE db_kingcafe_java;
                postgres    false            �          0    32209    m_admin 
   TABLE DATA           M   COPY public.m_admin (id, email, name, phone, user_credential_id) FROM stdin;
    public          postgres    false    215          �          0    32216 
   m_category 
   TABLE DATA           F   COPY public.m_category (id, category_code, category_name) FROM stdin;
    public          postgres    false    216   �       �          0    32223 
   m_customer 
   TABLE DATA           `   COPY public.m_customer (id, address, email, mobile_phone, name, user_credential_id) FROM stdin;
    public          postgres    false    217          �          0    32230    m_kasir 
   TABLE DATA           V   COPY public.m_kasir (id, address, email, name, phone, user_credential_id) FROM stdin;
    public          postgres    false    218   �       �          0    32237    m_menu 
   TABLE DATA           O   COPY public.m_menu (id, menu_code, menu_name, status, category_id) FROM stdin;
    public          postgres    false    219   �       �          0    32244    m_menu_price 
   TABLE DATA           R   COPY public.m_menu_price (id, is_active, price, category_id, menu_id) FROM stdin;
    public          postgres    false    220   k       �          0    32252    m_role 
   TABLE DATA           *   COPY public.m_role (id, name) FROM stdin;
    public          postgres    false    221   N       �          0    32260    m_user_credential 
   TABLE DATA           L   COPY public.m_user_credential (id, password, username, role_id) FROM stdin;
    public          postgres    false    222          �          0    32267    t_order 
   TABLE DATA           M   COPY public.t_order (id, order_type, receipt_number, trans_date) FROM stdin;
    public          postgres    false    223   6       �          0    32275    t_order_detail 
   TABLE DATA           O   COPY public.t_order_detail (id, quantity, menu_price_id, order_id) FROM stdin;
    public          postgres    false    224   4       �   e   x��1C! �Y���n=Hm~R��oM��&��
8����X.�ZUC���3��������T� q�B�8v�\��*R��lYodĞ�W����`      �      x�%�A
1 ���~ �4�6=�
��Kڤ �������A<f�"� 4&�J܋z-V'�eC���y�_��vM��̿5Ĭ���zd%3����I�ě�Bg�13h�^�=㘸��i�����9���7&�      �   �   x�m�9��@���}
_�P��Ke�sLR��A�H���$��I��Y)X,�dd� :B����aq����y���Z���6�g�����b��S},���}��?��X�v�{�C��HB>
�%�BZt�4�>���R!7���+⅔�2蝢��g�D	U�sABP=ZM�s�����s��I�      �   �   x�e�;��1�:90�'v:z�����S?��6tHt�h4�ܸS�!�n���8����LK�=�����c[��k�������x���^�m�IRN%儡��S��V�]T�Be%Mk�#�L�Xa�"��e�����<T��Oo��x��)�O�Rh��X��Ps)һSM3��c��hE�      �   �   x���;NC1���^����y��㒂	��4c�XI�!v��=���JXW�"�P�p��}Ɍ8�^)�ܶS��{��2�d���B��@w"�Q�[��h���t1ÑL0f�9|��V����庝�ˮ<��|�@(f�G��6����s+(΀�1��%�Nd��h����o���y���?O9���M_      �   �   x����q1��L.�@|�r����ת6_��~(�19�� f|��>=s��z�C�G������B��p��Ԙ��QB=��^ ��pW����/9�-mP�$VB�5@�4&�EfW]_Ù�ڳ�fcA�n���)��g�e-�3�G7�;�Z�Y�{�2��� �	��!�oy���U�ߪpr@�;8���PEw4g�����UY�      �   �   x�]��jC1��_6h%�C��]��1\'�!�ݕ��"H
��T30Ǌ�֡���X�T!�f��y�l�������y���T%�摡ž���^�V�d6ƚ
̃ �&��j"��쳐�*�����s�feh��E��6��BR������%٭4[َؠi_Ic]1Y���3�xM)� �-A@      �     x�=�KS�0��u�;ܦ��%K�(��
����*"�BQ~��sF7�$�<�������"�!-�D�T�Hɮ��"������p�}��0n��jS>����Y�5��C߽.����'�u�N�q��Yj��\#��F\*��P
aP�� q�ה��C,�sB	��&g��K(B@��X����g�>������r�8�����z�!���FWg�x��S����qo�;�4u&��6���Ze�ȁ
���J�VI���_P�{�\,���q���̠X<���q�:�u�6�ͨ៓��F�՟��]�N2 y'"��, rA��Sge��aѦJ�����R���*� x��k'5��<c����[��_J��O���i`�茇~���ݾȶ���c���I�d�vz�ZO#6�@� *s�� u�z�����jd<�>.q�Ѭ&���s:��{M;�N�ʍ\]�	�׽GY6�0�n�~�[��^����X�m�GG\�T
��wa���Q`��-�<�d˦      �   �   x�}ѹm1�xT����H)�6��:�/����N���l���P'Ц-eÌ��tL'��z����� �b�R��-�e�Nŷ�;JF��X�1�:������el��c�8@4T��=�3�������Z�v?���i�q���F$�
����O��[�E�M;�M�ؼ�Y<�Q
>�ꆬr ����t��?X���-PJ=�1W��@�'D��$�bJjg~�%]�+��{\�|ߥ��~e=      �   K  x�����%!D��\�m�2��a���#N�ZZ�x� �0���0A�{����g>hk�@F��'���(E�z�)�q�-ؾ
�b;�	��.�:��bB���~L�m��|��!-��ZY@"6	�,��硵�4
��3�����I&;$�+^2,^cB.J���*����y���=Ήy�=-Cؗ}�MM�"Oz[)т���'7nз(ľ�m�
����D��+�#��lYm��z��E��[i醣3`���L�(��ۆ��l�M�5nB����;�N�P^������z:�GnY�6�����8z�7�:��B��bB��������t�     